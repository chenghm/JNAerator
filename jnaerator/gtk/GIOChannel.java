package gtk;
import gtk.GtkLibrary.GIConv;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Bits;
import org.bridj.ann.CLong;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/giochannel.h:97</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public abstract class GIOChannel extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gint (Unsupported type) */
	/** C type : GIOFuncs* */
	@Field(1) 
	public Pointer<GIOFuncs > funcs() {
		return this.io.getPointerField(this, 1);
	}
	/** C type : GIOFuncs* */
	@Field(1) 
	public GIOChannel funcs(Pointer<GIOFuncs > funcs) {
		this.io.setPointerField(this, 1, funcs);
		return this;
	}
	/** C type : gchar* */
	@Field(2) 
	public Pointer<Byte > encoding() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : gchar* */
	@Field(2) 
	public GIOChannel encoding(Pointer<Byte > encoding) {
		this.io.setPointerField(this, 2, encoding);
		return this;
	}
	/** C type : GIConv */
	@Field(3) 
	public GIConv read_cd() {
		return this.io.getTypedPointerField(this, 3);
	}
	/** C type : GIConv */
	@Field(3) 
	public GIOChannel read_cd(GIConv read_cd) {
		this.io.setPointerField(this, 3, read_cd);
		return this;
	}
	/** C type : GIConv */
	@Field(4) 
	public GIConv write_cd() {
		return this.io.getTypedPointerField(this, 4);
	}
	/** C type : GIConv */
	@Field(4) 
	public GIOChannel write_cd(GIConv write_cd) {
		this.io.setPointerField(this, 4, write_cd);
		return this;
	}
	/**
	 * String which indicates the end of a line of text<br>
	 * C type : gchar*
	 */
	@Field(5) 
	public Pointer<Byte > line_term() {
		return this.io.getPointerField(this, 5);
	}
	/**
	 * String which indicates the end of a line of text<br>
	 * C type : gchar*
	 */
	@Field(5) 
	public GIOChannel line_term(Pointer<Byte > line_term) {
		this.io.setPointerField(this, 5, line_term);
		return this;
	}
	/**
	 * So we can have null in the line term<br>
	 * C type : guint
	 */
	@Field(6) 
	public int line_term_len() {
		return this.io.getIntField(this, 6);
	}
	/**
	 * So we can have null in the line term<br>
	 * C type : guint
	 */
	@Field(6) 
	public GIOChannel line_term_len(int line_term_len) {
		this.io.setIntField(this, 6, line_term_len);
		return this;
	}
	/** C type : gsize */
	@CLong 
	@Field(7) 
	public long buf_size() {
		return this.io.getCLongField(this, 7);
	}
	/** C type : gsize */
	@CLong 
	@Field(7) 
	public GIOChannel buf_size(long buf_size) {
		this.io.setCLongField(this, 7, buf_size);
		return this;
	}
	/**
	 * Raw data from the channel<br>
	 * C type : GString*
	 */
	@Field(8) 
	public Pointer<GString > read_buf() {
		return this.io.getPointerField(this, 8);
	}
	/**
	 * Raw data from the channel<br>
	 * C type : GString*
	 */
	@Field(8) 
	public GIOChannel read_buf(Pointer<GString > read_buf) {
		this.io.setPointerField(this, 8, read_buf);
		return this;
	}
	/**
	 * Channel data converted to UTF-8<br>
	 * C type : GString*
	 */
	@Field(9) 
	public Pointer<GString > encoded_read_buf() {
		return this.io.getPointerField(this, 9);
	}
	/**
	 * Channel data converted to UTF-8<br>
	 * C type : GString*
	 */
	@Field(9) 
	public GIOChannel encoded_read_buf(Pointer<GString > encoded_read_buf) {
		this.io.setPointerField(this, 9, encoded_read_buf);
		return this;
	}
	/**
	 * Data ready to be written to the file<br>
	 * C type : GString*
	 */
	@Field(10) 
	public Pointer<GString > write_buf() {
		return this.io.getPointerField(this, 10);
	}
	/**
	 * Data ready to be written to the file<br>
	 * C type : GString*
	 */
	@Field(10) 
	public GIOChannel write_buf(Pointer<GString > write_buf) {
		this.io.setPointerField(this, 10, write_buf);
		return this;
	}
	/**
	 * UTF-8 partial characters, null terminated<br>
	 * C type : gchar[6]
	 */
	@Array({6}) 
	@Field(11) 
	public Pointer<Byte > partial_write_buf() {
		return this.io.getPointerField(this, 11);
	}
	/**
	 * The encoding uses the buffers<br>
	 * C type : guint
	 */
	@Field(12) 
	@Bits(1) 
	public int use_buffer() {
		return this.io.getIntField(this, 12);
	}
	/**
	 * The encoding uses the buffers<br>
	 * C type : guint
	 */
	@Field(12) 
	@Bits(1) 
	public GIOChannel use_buffer(int use_buffer) {
		this.io.setIntField(this, 12, use_buffer);
		return this;
	}
	/**
	 * The encoding uses the GIConv coverters<br>
	 * C type : guint
	 */
	@Field(13) 
	@Bits(1) 
	public int do_encode() {
		return this.io.getIntField(this, 13);
	}
	/**
	 * The encoding uses the GIConv coverters<br>
	 * C type : guint
	 */
	@Field(13) 
	@Bits(1) 
	public GIOChannel do_encode(int do_encode) {
		this.io.setIntField(this, 13, do_encode);
		return this;
	}
	/**
	 * Close the channel on final unref<br>
	 * C type : guint
	 */
	@Field(14) 
	@Bits(1) 
	public int close_on_unref() {
		return this.io.getIntField(this, 14);
	}
	/**
	 * Close the channel on final unref<br>
	 * C type : guint
	 */
	@Field(14) 
	@Bits(1) 
	public GIOChannel close_on_unref(int close_on_unref) {
		this.io.setIntField(this, 14, close_on_unref);
		return this;
	}
	/**
	 * Cached GIOFlag<br>
	 * C type : guint
	 */
	@Field(15) 
	@Bits(1) 
	public int is_readable() {
		return this.io.getIntField(this, 15);
	}
	/**
	 * Cached GIOFlag<br>
	 * C type : guint
	 */
	@Field(15) 
	@Bits(1) 
	public GIOChannel is_readable(int is_readable) {
		this.io.setIntField(this, 15, is_readable);
		return this;
	}
	/**
	 * ditto<br>
	 * C type : guint
	 */
	@Field(16) 
	@Bits(1) 
	public int is_writeable() {
		return this.io.getIntField(this, 16);
	}
	/**
	 * ditto<br>
	 * C type : guint
	 */
	@Field(16) 
	@Bits(1) 
	public GIOChannel is_writeable(int is_writeable) {
		this.io.setIntField(this, 16, is_writeable);
		return this;
	}
	/**
	 * ditto<br>
	 * C type : guint
	 */
	@Field(17) 
	@Bits(1) 
	public int is_seekable() {
		return this.io.getIntField(this, 17);
	}
	/**
	 * ditto<br>
	 * C type : guint
	 */
	@Field(17) 
	@Bits(1) 
	public GIOChannel is_seekable(int is_seekable) {
		this.io.setIntField(this, 17, is_seekable);
		return this;
	}
	/** Conversion Error : gpointer (Unsupported type) */
	/** Conversion Error : gpointer (Unsupported type) */
}