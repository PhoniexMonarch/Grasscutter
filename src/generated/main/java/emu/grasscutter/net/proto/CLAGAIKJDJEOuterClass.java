// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CLAGAIKJDJE.proto

package emu.grasscutter.net.proto;

public final class CLAGAIKJDJEOuterClass {
    private CLAGAIKJDJEOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface CLAGAIKJDJEOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:CLAGAIKJDJE)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 EELEACIIBLH = 3;</code>
         *
         * @return The eELEACIIBLH.
         */
        int getEELEACIIBLH();
    }
    /** Protobuf type {@code CLAGAIKJDJE} */
    public static final class CLAGAIKJDJE extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:CLAGAIKJDJE)
            CLAGAIKJDJEOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use CLAGAIKJDJE.newBuilder() to construct.
        private CLAGAIKJDJE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private CLAGAIKJDJE() {}

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new CLAGAIKJDJE();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private CLAGAIKJDJE(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new java.lang.NullPointerException();
            }
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        case 24:
                            {
                                eELEACIIBLH_ = input.readUInt32();
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.internal_static_CLAGAIKJDJE_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass
                    .internal_static_CLAGAIKJDJE_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.class,
                            emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.Builder.class);
        }

        public static final int EELEACIIBLH_FIELD_NUMBER = 3;
        private int eELEACIIBLH_;
        /**
         * <code>uint32 EELEACIIBLH = 3;</code>
         *
         * @return The eELEACIIBLH.
         */
        @java.lang.Override
        public int getEELEACIIBLH() {
            return eELEACIIBLH_;
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            if (eELEACIIBLH_ != 0) {
                output.writeUInt32(3, eELEACIIBLH_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (eELEACIIBLH_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(3, eELEACIIBLH_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE other =
                    (emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE) obj;

            if (getEELEACIIBLH() != other.getEELEACIIBLH()) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + EELEACIIBLH_FIELD_NUMBER;
            hash = (53 * hash) + getEELEACIIBLH();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /** Protobuf type {@code CLAGAIKJDJE} */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:CLAGAIKJDJE)
                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJEOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass
                        .internal_static_CLAGAIKJDJE_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass
                        .internal_static_CLAGAIKJDJE_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.class,
                                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                eELEACIIBLH_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass
                        .internal_static_CLAGAIKJDJE_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE build() {
                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE buildPartial() {
                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE result =
                        new emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE(this);
                result.eELEACIIBLH_ = eELEACIIBLH_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE) {
                    return mergeFrom((emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE other) {
                if (other
                        == emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE.getDefaultInstance())
                    return this;
                if (other.getEELEACIIBLH() != 0) {
                    setEELEACIIBLH(other.getEELEACIIBLH());
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int eELEACIIBLH_;
            /**
             * <code>uint32 EELEACIIBLH = 3;</code>
             *
             * @return The eELEACIIBLH.
             */
            @java.lang.Override
            public int getEELEACIIBLH() {
                return eELEACIIBLH_;
            }
            /**
             * <code>uint32 EELEACIIBLH = 3;</code>
             *
             * @param value The eELEACIIBLH to set.
             * @return This builder for chaining.
             */
            public Builder setEELEACIIBLH(int value) {

                eELEACIIBLH_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 EELEACIIBLH = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEELEACIIBLH() {

                eELEACIIBLH_ = 0;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }

            // @@protoc_insertion_point(builder_scope:CLAGAIKJDJE)
        }

        // @@protoc_insertion_point(class_scope:CLAGAIKJDJE)
        private static final emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE();
        }

        public static emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<CLAGAIKJDJE> PARSER =
                new com.google.protobuf.AbstractParser<CLAGAIKJDJE>() {
                    @java.lang.Override
                    public CLAGAIKJDJE parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new CLAGAIKJDJE(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<CLAGAIKJDJE> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<CLAGAIKJDJE> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.CLAGAIKJDJEOuterClass.CLAGAIKJDJE getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_CLAGAIKJDJE_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_CLAGAIKJDJE_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021CLAGAIKJDJE.proto\"\"\n\013CLAGAIKJDJE\022\023\n\013EE"
                    + "LEACIIBLH\030\003 \001(\rB\033\n\031emu.grasscutter.net.p"
                    + "rotob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_CLAGAIKJDJE_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_CLAGAIKJDJE_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_CLAGAIKJDJE_descriptor,
                        new java.lang.String[] {
                            "EELEACIIBLH",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}