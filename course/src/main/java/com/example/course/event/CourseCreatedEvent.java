/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.course.event;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CourseCreatedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2832053232291206879L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CourseCreatedEvent\",\"namespace\":\"com.example.course.event\",\"fields\":[{\"name\":\"courseNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CourseCreatedEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CourseCreatedEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CourseCreatedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CourseCreatedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CourseCreatedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CourseCreatedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CourseCreatedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CourseCreatedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CourseCreatedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence courseNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CourseCreatedEvent() {}

  /**
   * All-args constructor.
   * @param courseNumber The new value for courseNumber
   */
  public CourseCreatedEvent(java.lang.CharSequence courseNumber) {
    this.courseNumber = courseNumber;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return courseNumber;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: courseNumber = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'courseNumber' field.
   * @return The value of the 'courseNumber' field.
   */
  public java.lang.CharSequence getCourseNumber() {
    return courseNumber;
  }


  /**
   * Sets the value of the 'courseNumber' field.
   * @param value the value to set.
   */
  public void setCourseNumber(java.lang.CharSequence value) {
    this.courseNumber = value;
  }

  /**
   * Creates a new CourseCreatedEvent RecordBuilder.
   * @return A new CourseCreatedEvent RecordBuilder
   */
  public static com.example.course.event.CourseCreatedEvent.Builder newBuilder() {
    return new com.example.course.event.CourseCreatedEvent.Builder();
  }

  /**
   * Creates a new CourseCreatedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CourseCreatedEvent RecordBuilder
   */
  public static com.example.course.event.CourseCreatedEvent.Builder newBuilder(com.example.course.event.CourseCreatedEvent.Builder other) {
    if (other == null) {
      return new com.example.course.event.CourseCreatedEvent.Builder();
    } else {
      return new com.example.course.event.CourseCreatedEvent.Builder(other);
    }
  }

  /**
   * Creates a new CourseCreatedEvent RecordBuilder by copying an existing CourseCreatedEvent instance.
   * @param other The existing instance to copy.
   * @return A new CourseCreatedEvent RecordBuilder
   */
  public static com.example.course.event.CourseCreatedEvent.Builder newBuilder(com.example.course.event.CourseCreatedEvent other) {
    if (other == null) {
      return new com.example.course.event.CourseCreatedEvent.Builder();
    } else {
      return new com.example.course.event.CourseCreatedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for CourseCreatedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CourseCreatedEvent>
    implements org.apache.avro.data.RecordBuilder<CourseCreatedEvent> {

    private java.lang.CharSequence courseNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.course.event.CourseCreatedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.courseNumber)) {
        this.courseNumber = data().deepCopy(fields()[0].schema(), other.courseNumber);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CourseCreatedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.course.event.CourseCreatedEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.courseNumber)) {
        this.courseNumber = data().deepCopy(fields()[0].schema(), other.courseNumber);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'courseNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getCourseNumber() {
      return courseNumber;
    }


    /**
      * Sets the value of the 'courseNumber' field.
      * @param value The value of 'courseNumber'.
      * @return This builder.
      */
    public com.example.course.event.CourseCreatedEvent.Builder setCourseNumber(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.courseNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'courseNumber' field has been set.
      * @return True if the 'courseNumber' field has been set, false otherwise.
      */
    public boolean hasCourseNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'courseNumber' field.
      * @return This builder.
      */
    public com.example.course.event.CourseCreatedEvent.Builder clearCourseNumber() {
      courseNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CourseCreatedEvent build() {
      try {
        CourseCreatedEvent record = new CourseCreatedEvent();
        record.courseNumber = fieldSetFlags()[0] ? this.courseNumber : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CourseCreatedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<CourseCreatedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CourseCreatedEvent>
    READER$ = (org.apache.avro.io.DatumReader<CourseCreatedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.courseNumber);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.courseNumber = in.readString(this.courseNumber instanceof Utf8 ? (Utf8)this.courseNumber : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.courseNumber = in.readString(this.courseNumber instanceof Utf8 ? (Utf8)this.courseNumber : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










