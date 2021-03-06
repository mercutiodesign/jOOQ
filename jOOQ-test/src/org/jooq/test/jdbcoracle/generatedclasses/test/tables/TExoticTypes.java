/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TExoticTypes extends org.jooq.impl.TableImpl<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord> {

	private static final long serialVersionUID = 1259908709;

	/**
	 * The singleton instance of <code>TEST.T_EXOTIC_TYPES</code>
	 */
	public static final org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes T_EXOTIC_TYPES = new org.jooq.test.jdbcoracle.generatedclasses.test.tables.TExoticTypes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord> getRecordType() {
		return org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord.class;
	}

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_EXOTIC_TYPES);

	/**
	 * The column <code>TEST.T_EXOTIC_TYPES.UU</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.jdbcoracle.generatedclasses.test.tables.records.TExoticTypesRecord, java.util.UUID> UU = createField("UU", org.jooq.impl.SQLDataType.UUID, T_EXOTIC_TYPES);

	/**
	 * No further instances allowed
	 */
	private TExoticTypes() {
		super("T_EXOTIC_TYPES", org.jooq.test.jdbcoracle.generatedclasses.test.Test.TEST);
	}
}
