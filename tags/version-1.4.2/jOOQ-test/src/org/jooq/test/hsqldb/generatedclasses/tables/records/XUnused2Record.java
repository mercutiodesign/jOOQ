/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;


import org.jooq.Configuration;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.hsqldb.generatedclasses.tables.XUnused2;


/**
 * This class is generated by jOOQ.
 */
public class XUnused2Record extends UpdatableRecordImpl<XUnused2Record> {

	private static final long serialVersionUID = 1L;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(Integer value) {
		setValue(XUnused2.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public Integer getId() {
		return getValue(XUnused2.ID);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [UNUSED_ID] REFERENCES X_UNUSED [ID, NAME]
	 */
	public void setUnusedId(Integer value) {
		setValue(XUnused2.UNUSED_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * FOREIGN KEY [UNUSED_ID] REFERENCES X_UNUSED [ID, NAME]
	 */
	public Integer getUnusedId() {
		return getValue(XUnused2.UNUSED_ID);
	}

	public XUnused2Record(Configuration configuration) {
		super(configuration, XUnused2.X_UNUSED_2);
	}
}
