/**
 * X-Cure-Chat
 * Copyright (C) 2013  Dr. Ivan S. Zapreev
 * www: https://nl.linkedin.com/in/zapreevis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.#
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * The user data objects package.
 * (C) Ivan S. Zapreev, 2009
 */
package com.xcurechat.client.data.search;

import com.xcurechat.client.data.ChatRoomData;

/**
 * @author zapreevis
 * This class is supposed to store extra search parameters for the search of the users
 * when adding new users to a private/public room.
 */
public class NonRoomUserSearchData extends UserSearchData {
	//Has to be set if we search for users that are not yet allowed to browse the given room
	public int roomID = ChatRoomData.UNKNOWN_ROOM_ID;
}
