/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTable extends org.jooq.impl.TableImpl<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 1574932462;

	/**
	 * The singleton instance of <code>T_639_NUMBERS_TABLE</code>
	 */
	public static final org.jooq.test.access.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.access.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord.class;
	}

	/**
	 * The column <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.TINYINT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> TINYINT = createField("TINYINT", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.XSHORT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> XSHORT = createField("XSHORT", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.XINTEGER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> XINTEGER = createField("XINTEGER", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.XLONG</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> XLONG = createField("XLONG", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL.precision(100, 4), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL.precision(100, 4), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL.precision(100, 4), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL.precision(100, 4), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL.precision(100, 4), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL.precision(100, 4), T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.XFLOAT</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> XFLOAT = createField("XFLOAT", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE);

	/**
	 * The column <code>T_639_NUMBERS_TABLE.XDOUBLE</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> XDOUBLE = createField("XDOUBLE", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE);

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		super("T_639_NUMBERS_TABLE", org.jooq.test.access.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> getPrimaryKey() {
		return org.jooq.test.access.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.access.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}
}
