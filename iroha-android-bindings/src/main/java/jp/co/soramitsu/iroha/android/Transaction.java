/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package jp.co.soramitsu.iroha.android;

public class Transaction {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Transaction(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Transaction obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        irohaJNI.delete_Transaction(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Transaction(Transaction o) {
    this(irohaJNI.new_Transaction__SWIG_1(Transaction.getCPtr(o), o), true);
  }

  public String creatorAccountId() {
    return irohaJNI.Transaction_creatorAccountId(swigCPtr, this);
  }

  public java.math.BigInteger transactionCounter() {
    return irohaJNI.Transaction_transactionCounter(swigCPtr, this);
  }

  public SWIGTYPE_p_shared_model__proto__Transaction__CommandsType commands() {
    return new SWIGTYPE_p_shared_model__proto__Transaction__CommandsType(irohaJNI.Transaction_commands(swigCPtr, this), false);
  }

  public Blob blob() {
    return new Blob(irohaJNI.Transaction_blob(swigCPtr, this), false);
  }

  public Blob payload() {
    return new Blob(irohaJNI.Transaction_payload(swigCPtr, this), false);
  }

  public Hash hash() {
    return new Hash(irohaJNI.Transaction_hash(swigCPtr, this), false);
  }

  public SWIGTYPE_p_shared_model__interface__SignatureSetType signatures() {
    return new SWIGTYPE_p_shared_model__interface__SignatureSetType(irohaJNI.Transaction_signatures(swigCPtr, this), false);
  }

  public boolean addSignature(SWIGTYPE_p_detail__PolymorphicWrapperT_shared_model__interface__Signature_t signature) {
    return irohaJNI.Transaction_addSignature(swigCPtr, this, SWIGTYPE_p_detail__PolymorphicWrapperT_shared_model__interface__Signature_t.getCPtr(signature));
  }

  public boolean clearSignatures() {
    return irohaJNI.Transaction_clearSignatures(swigCPtr, this);
  }

  public java.math.BigInteger createdTime() {
    return irohaJNI.Transaction_createdTime(swigCPtr, this);
  }

}
