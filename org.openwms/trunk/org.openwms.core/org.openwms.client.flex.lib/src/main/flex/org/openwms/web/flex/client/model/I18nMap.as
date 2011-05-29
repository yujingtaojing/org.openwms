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
package org.openwms.web.flex.client.model{

    import flash.utils.Dictionary;
    import flash.utils.Proxy;
    import flash.utils.flash_proxy;

    [Name("i18nMap")]
    [Bindable]
    /**
     * A ModelLocator is the main model backing bean to store session data.
     * It is a Tide component and can be injected by name=modelLocator.
     *
     * @author <a href="mailto:scherrer@openwms.org">Heiko Scherrer</a>
     * @version $Revision$
     * @since 0.1
     */
    public dynamic class I18nMap extends Proxy {

        private var map:Dictionary = new Dictionary();

        /**
         * Constructor.
         */
        public function I18nMap() : void {
            super();
        }

        flash_proxy override function getProperty(name:*):* {
            trace("jjjjjjj");
            return map[name];
        }

        flash_proxy override function setProperty(name:*, value:*):void {
            trace("KEY:"+name);
            trace("VALUE:"+value);
            map[(name as String)] = value;
        }
    }
}

