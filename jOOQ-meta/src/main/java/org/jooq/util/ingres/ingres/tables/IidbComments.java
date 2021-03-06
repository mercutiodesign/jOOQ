/**
 * This class is generated by jOOQ
 */
package org.jooq.util.ingres.ingres.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "3.0.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IidbComments extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 1033035185;

	/**
	 * The singleton instance of <code>$ingres.iidb_comments</code>
	 */
	public static final org.jooq.util.ingres.ingres.tables.IidbComments IIDB_COMMENTS = new org.jooq.util.ingres.ingres.tables.IidbComments();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>$ingres.iidb_comments.object_name</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.CHAR.length(256), IIDB_COMMENTS);

	/**
	 * The column <code>$ingres.iidb_comments.object_owner</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_OWNER = createField("object_owner", org.jooq.impl.SQLDataType.CHAR.length(32), IIDB_COMMENTS);

	/**
	 * The column <code>$ingres.iidb_comments.object_type</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.CHAR.length(1), IIDB_COMMENTS);

	/**
	 * The column <code>$ingres.iidb_comments.short_remark</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> SHORT_REMARK = createField("short_remark", org.jooq.impl.SQLDataType.CHAR.length(60), IIDB_COMMENTS);

	/**
	 * The column <code>$ingres.iidb_comments.text_sequence</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.Long> TEXT_SEQUENCE = createField("text_sequence", org.jooq.impl.SQLDataType.BIGINT, IIDB_COMMENTS);

	/**
	 * The column <code>$ingres.iidb_comments.long_remark</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.Record, java.lang.String> LONG_REMARK = createField("long_remark", org.jooq.impl.SQLDataType.VARCHAR.length(1600), IIDB_COMMENTS);

	/**
	 * No further instances allowed
	 */
	private IidbComments() {
		super("iidb_comments", org.jooq.util.ingres.ingres.$ingres.$INGRES);
	}
}
