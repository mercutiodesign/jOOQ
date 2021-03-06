/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XTestCase_2025 extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record> {

	private static final long serialVersionUID = -953837751;

	/**
	 * The singleton instance of <code>test2.x_test_case_2025</code>
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.XTestCase_2025 X_TEST_CASE_2025 = new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_2025();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record.class;
	}

	/**
	 * The column <code>test2.x_test_case_2025.ref_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record, java.lang.Integer> REF_ID = createField("ref_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>test2.x_test_case_2025.ref_name</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record, java.lang.String> REF_NAME = createField("ref_name", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * Create a <code>test2.x_test_case_2025</code> table reference
	 */
	public XTestCase_2025() {
		super("x_test_case_2025", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	/**
	 * Create an aliased <code>test2.x_test_case_2025</code> table reference
	 */
	public XTestCase_2025(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql2.generatedclasses.tables.records.XTestCase_2025Record, ?>>asList(org.jooq.test.mysql2.generatedclasses.Keys.FK_X_TEST_CASE_2025_1, org.jooq.test.mysql2.generatedclasses.Keys.FK_X_TEST_CASE_2025_2, org.jooq.test.mysql2.generatedclasses.Keys.FK_X_TEST_CASE_2025_3);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.XTestCase_2025 as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.XTestCase_2025(alias);
	}
}
