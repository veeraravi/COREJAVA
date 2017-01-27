package com.lara.serialization;

import java.io.Serializable;

class Cat implements Serializable {
int legs = 4;
int ears = 2;
int eyes = 2;
/* (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ears;
	result = prime * result + eyes;
	result = prime * result + legs;
	return result;
}
/* (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Cat other = (Cat) obj;
	if (ears != other.ears)
		return false;
	if (eyes != other.eyes)
		return false;
	if (legs != other.legs)
		return false;
	return true;
}
}
