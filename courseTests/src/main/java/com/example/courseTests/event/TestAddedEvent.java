/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.courseTests.event;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class TestAddedEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7236616108619630981L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"TestAddedEvent\",\"namespace\":\"com.example.courseTests.event\",\"fields\":[{\"name\":\"testNumber\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<TestAddedEvent> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<TestAddedEvent> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<TestAddedEvent> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<TestAddedEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<TestAddedEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this TestAddedEvent to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a TestAddedEvent from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a TestAddedEvent instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static TestAddedEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence testNumber;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public TestAddedEvent() {}

  /**
   * All-args constructor.
   * @param testNumber The new value for testNumber
   */
  public TestAddedEvent(java.lang.CharSequence testNumber) {
    this.testNumber = testNumber;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return testNumber;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: testNumber = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'testNumber' field.
   * @return The value of the 'testNumber' field.
   */
  public java.lang.CharSequence getTestNumber() {
    return testNumber;
  }


  /**
   * Sets the value of the 'testNumber' field.
   * @param value the value to set.
   */
  public void setTestNumber(java.lang.CharSequence value) {
    this.testNumber = value;
  }

  /**
   * Creates a new TestAddedEvent RecordBuilder.
   * @return A new TestAddedEvent RecordBuilder
   */
  public static com.example.courseTests.event.TestAddedEvent.Builder newBuilder() {
    return new com.example.courseTests.event.TestAddedEvent.Builder();
  }

  /**
   * Creates a new TestAddedEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new TestAddedEvent RecordBuilder
   */
  public static com.example.courseTests.event.TestAddedEvent.Builder newBuilder(com.example.courseTests.event.TestAddedEvent.Builder other) {
    if (other == null) {
      return new com.example.courseTests.event.TestAddedEvent.Builder();
    } else {
      return new com.example.courseTests.event.TestAddedEvent.Builder(other);
    }
  }

  /**
   * Creates a new TestAddedEvent RecordBuilder by copying an existing TestAddedEvent instance.
   * @param other The existing instance to copy.
   * @return A new TestAddedEvent RecordBuilder
   */
  public static com.example.courseTests.event.TestAddedEvent.Builder newBuilder(com.example.courseTests.event.TestAddedEvent other) {
    if (other == null) {
      return new com.example.courseTests.event.TestAddedEvent.Builder();
    } else {
      return new com.example.courseTests.event.TestAddedEvent.Builder(other);
    }
  }

  /**
   * RecordBuilder for TestAddedEvent instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<TestAddedEvent>
    implements org.apache.avro.data.RecordBuilder<TestAddedEvent> {

    private java.lang.CharSequence testNumber;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.courseTests.event.TestAddedEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.testNumber)) {
        this.testNumber = data().deepCopy(fields()[0].schema(), other.testNumber);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing TestAddedEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.courseTests.event.TestAddedEvent other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.testNumber)) {
        this.testNumber = data().deepCopy(fields()[0].schema(), other.testNumber);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'testNumber' field.
      * @return The value.
      */
    public java.lang.CharSequence getTestNumber() {
      return testNumber;
    }


    /**
      * Sets the value of the 'testNumber' field.
      * @param value The value of 'testNumber'.
      * @return This builder.
      */
    public com.example.courseTests.event.TestAddedEvent.Builder setTestNumber(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.testNumber = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'testNumber' field has been set.
      * @return True if the 'testNumber' field has been set, false otherwise.
      */
    public boolean hasTestNumber() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'testNumber' field.
      * @return This builder.
      */
    public com.example.courseTests.event.TestAddedEvent.Builder clearTestNumber() {
      testNumber = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public TestAddedEvent build() {
      try {
        TestAddedEvent record = new TestAddedEvent();
        record.testNumber = fieldSetFlags()[0] ? this.testNumber : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<TestAddedEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<TestAddedEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<TestAddedEvent>
    READER$ = (org.apache.avro.io.DatumReader<TestAddedEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.testNumber);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.testNumber = in.readString(this.testNumber instanceof Utf8 ? (Utf8)this.testNumber : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.testNumber = in.readString(this.testNumber instanceof Utf8 ? (Utf8)this.testNumber : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










