/*
 * Copyright (C) 2012-2013 GSyC/LibreSoft, Universidad Rey Juan Carlos
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * Authors: Santiago Dueñas <sduenas@libresoft.es>
 *
 */

package eu.alertproject.kesi.jobs;

import java.sql.Timestamp;

import eu.alertproject.kesi.model.StructuredKnowledgeSource;

public class EventJob implements Job {
    private static int id = 0;
    private final StructuredKnowledgeSource source;
    private final Timestamp fromDate;

    public EventJob(StructuredKnowledgeSource source, Timestamp fromDate) {
        ++id;
        this.source = source;
        this.fromDate = fromDate;
    }

    @Override
    public String getID() {
        return String.valueOf(id);
    }

    public StructuredKnowledgeSource getSource() {
        return source;
    }

    public Timestamp getFromDate() {
        return fromDate;
    }

}
