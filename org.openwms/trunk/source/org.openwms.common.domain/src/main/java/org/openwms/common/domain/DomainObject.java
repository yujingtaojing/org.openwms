/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.common.domain;

import java.io.Serializable;

/**
 * A DomainObject, implementations of this class offer some common
 * functionality of all domain objects.<br>
 * Each domain object:
 * <ul>
 * <li>shall have a optimistic locking field</li>
 * <li>should know if it is a transient or persisted instance</li>
 * <li>should offer its technical key value</li>
 * </ul>
 * 
 * @author <a href="mailto:scherrer@users.sourceforge.net">Heiko Scherrer</a>
 * @version $Revision: $
 * @since 0.1
 */
public interface DomainObject<ID extends Serializable> {

	/**
	 * Check whether the persistent domain object is transient or not.
	 * 
	 * @return <code>true</code> if transient (not persisted before), otherwise
	 *         <code>false</code>.
	 */
	boolean isNew();

	/**
	 * Each persistent domain class must have an optimistic locking field.
	 * 
	 * @return the version number
	 */
	long getVersion();

	/**
	 * Return the technical key.
	 * 
	 * @return The technical, unique key
	 */
	ID getId();

}
