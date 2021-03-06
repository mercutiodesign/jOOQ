/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TDates implements org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITDates {

	private static final long serialVersionUID = 226136137;

	private java.lang.Integer          id;
	private java.sql.Date              d;
	private java.sql.Timestamp         t;
	private java.sql.Timestamp         ts;
	private java.lang.Integer          dInt;
	private java.lang.Long             tsBigint;
	private org.jooq.types.YearToMonth iY;
	private org.jooq.types.DayToSecond iD;

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@Override
	public java.sql.Date getD() {
		return this.d;
	}

	@Override
	public void setD(java.sql.Date d) {
		this.d = d;
	}

	@Override
	public java.sql.Timestamp getT() {
		return this.t;
	}

	@Override
	public void setT(java.sql.Timestamp t) {
		this.t = t;
	}

	@Override
	public java.sql.Timestamp getTs() {
		return this.ts;
	}

	@Override
	public void setTs(java.sql.Timestamp ts) {
		this.ts = ts;
	}

	@Override
	public java.lang.Integer getDInt() {
		return this.dInt;
	}

	@Override
	public void setDInt(java.lang.Integer dInt) {
		this.dInt = dInt;
	}

	@Override
	public java.lang.Long getTsBigint() {
		return this.tsBigint;
	}

	@Override
	public void setTsBigint(java.lang.Long tsBigint) {
		this.tsBigint = tsBigint;
	}

	@Override
	public org.jooq.types.YearToMonth getIY() {
		return this.iY;
	}

	@Override
	public void setIY(org.jooq.types.YearToMonth iY) {
		this.iY = iY;
	}

	@Override
	public org.jooq.types.DayToSecond getID() {
		return this.iD;
	}

	@Override
	public void setID(org.jooq.types.DayToSecond iD) {
		this.iD = iD;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITDates from) {
		setId(from.getId());
		setD(from.getD());
		setT(from.getT());
		setTs(from.getTs());
		setDInt(from.getDInt());
		setTsBigint(from.getTsBigint());
		setIY(from.getIY());
		setID(from.getID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.ITDates> E into(E into) {
		into.from(this);
		return into;
	}
}
