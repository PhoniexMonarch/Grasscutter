// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerConfirmMatchRsp.proto

package emu.grasscutter.net.proto;

public final class PlayerConfirmMatchRspOuterClass {
    private PlayerConfirmMatchRspOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface PlayerConfirmMatchRspOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:PlayerConfirmMatchRsp)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>uint32 match_id = 1;</code>
         *
         * @return The matchId.
         */
        int getMatchId();

        /**
         * <code>.MatchType match_type = 6;</code>
         *
         * @return The enum numeric value on the wire for matchType.
         */
        int getMatchTypeValue();
        /**
         * <code>.MatchType match_type = 6;</code>
         *
         * @return The matchType.
         */
        emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType();

        /**
         * <code>bool is_agreed = 11;</code>
         *
         * @return The isAgreed.
         */
        boolean getIsAgreed();

        /**
         * <code>int32 retcode = 9;</code>
         *
         * @return The retcode.
         */
        int getRetcode();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 4173
     * Obf: PMDNIAJFAFJ
     * </pre>
     *
     * Protobuf type {@code PlayerConfirmMatchRsp}
     */
    public static final class PlayerConfirmMatchRsp extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:PlayerConfirmMatchRsp)
            PlayerConfirmMatchRspOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use PlayerConfirmMatchRsp.newBuilder() to construct.
        private PlayerConfirmMatchRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private PlayerConfirmMatchRsp() {
            matchType_ = 0;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new PlayerConfirmMatchRsp();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private PlayerConfirmMatchRsp(
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
                        case 8:
                            {
                                matchId_ = input.readUInt32();
                                break;
                            }
                        case 48:
                            {
                                int rawValue = input.readEnum();

                                matchType_ = rawValue;
                                break;
                            }
                        case 72:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 88:
                            {
                                isAgreed_ = input.readBool();
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
            return emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass
                    .internal_static_PlayerConfirmMatchRsp_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass
                    .internal_static_PlayerConfirmMatchRsp_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp.class,
                            emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                                    .Builder.class);
        }

        public static final int MATCH_ID_FIELD_NUMBER = 1;
        private int matchId_;
        /**
         * <code>uint32 match_id = 1;</code>
         *
         * @return The matchId.
         */
        @java.lang.Override
        public int getMatchId() {
            return matchId_;
        }

        public static final int MATCH_TYPE_FIELD_NUMBER = 6;
        private int matchType_;
        /**
         * <code>.MatchType match_type = 6;</code>
         *
         * @return The enum numeric value on the wire for matchType.
         */
        @java.lang.Override
        public int getMatchTypeValue() {
            return matchType_;
        }
        /**
         * <code>.MatchType match_type = 6;</code>
         *
         * @return The matchType.
         */
        @java.lang.Override
        public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
            @SuppressWarnings("deprecation")
            emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result =
                    emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
            return result == null
                    ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED
                    : result;
        }

        public static final int IS_AGREED_FIELD_NUMBER = 11;
        private boolean isAgreed_;
        /**
         * <code>bool is_agreed = 11;</code>
         *
         * @return The isAgreed.
         */
        @java.lang.Override
        public boolean getIsAgreed() {
            return isAgreed_;
        }

        public static final int RETCODE_FIELD_NUMBER = 9;
        private int retcode_;
        /**
         * <code>int32 retcode = 9;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
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
            if (matchId_ != 0) {
                output.writeUInt32(1, matchId_);
            }
            if (matchType_
                    != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
                output.writeEnum(6, matchType_);
            }
            if (retcode_ != 0) {
                output.writeInt32(9, retcode_);
            }
            if (isAgreed_ != false) {
                output.writeBool(11, isAgreed_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (matchId_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(1, matchId_);
            }
            if (matchType_
                    != emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.MATCH_TYPE_NONE.getNumber()) {
                size += com.google.protobuf.CodedOutputStream.computeEnumSize(6, matchType_);
            }
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(9, retcode_);
            }
            if (isAgreed_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(11, isAgreed_);
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
            if (!(obj
                    instanceof
                    emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp other =
                    (emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp) obj;

            if (getMatchId() != other.getMatchId()) return false;
            if (matchType_ != other.matchType_) return false;
            if (getIsAgreed() != other.getIsAgreed()) return false;
            if (getRetcode() != other.getRetcode()) return false;
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
            hash = (37 * hash) + MATCH_ID_FIELD_NUMBER;
            hash = (53 * hash) + getMatchId();
            hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
            hash = (53 * hash) + matchType_;
            hash = (37 * hash) + IS_AGREED_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsAgreed());
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(java.nio.ByteBuffer data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(
                        java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(com.google.protobuf.ByteString data)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(
                        com.google.protobuf.ByteString data,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseDelimitedFrom(
                        java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                parseFrom(
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
                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp prototype) {
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
        /**
         *
         *
         * <pre>
         * CmdId: 4173
         * Obf: PMDNIAJFAFJ
         * </pre>
         *
         * Protobuf type {@code PlayerConfirmMatchRsp}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:PlayerConfirmMatchRsp)
                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRspOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass
                        .internal_static_PlayerConfirmMatchRsp_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass
                        .internal_static_PlayerConfirmMatchRsp_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                                        .class,
                                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                                        .Builder.class);
            }

            // Construct using
            // emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp.newBuilder()
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
                matchId_ = 0;

                matchType_ = 0;

                isAgreed_ = false;

                retcode_ = 0;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass
                        .internal_static_PlayerConfirmMatchRsp_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                        .getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                    build() {
                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp result =
                        buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                    buildPartial() {
                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp result =
                        new emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp(
                                this);
                result.matchId_ = matchId_;
                result.matchType_ = matchType_;
                result.isAgreed_ = isAgreed_;
                result.retcode_ = retcode_;
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
                if (other
                        instanceof
                        emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp) {
                    return mergeFrom(
                            (emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp)
                                    other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(
                    emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp other) {
                if (other
                        == emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                                .getDefaultInstance()) return this;
                if (other.getMatchId() != 0) {
                    setMatchId(other.getMatchId());
                }
                if (other.matchType_ != 0) {
                    setMatchTypeValue(other.getMatchTypeValue());
                }
                if (other.getIsAgreed() != false) {
                    setIsAgreed(other.getIsAgreed());
                }
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
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
                emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                        parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int matchId_;
            /**
             * <code>uint32 match_id = 1;</code>
             *
             * @return The matchId.
             */
            @java.lang.Override
            public int getMatchId() {
                return matchId_;
            }
            /**
             * <code>uint32 match_id = 1;</code>
             *
             * @param value The matchId to set.
             * @return This builder for chaining.
             */
            public Builder setMatchId(int value) {

                matchId_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 match_id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMatchId() {

                matchId_ = 0;
                onChanged();
                return this;
            }

            private int matchType_ = 0;
            /**
             * <code>.MatchType match_type = 6;</code>
             *
             * @return The enum numeric value on the wire for matchType.
             */
            @java.lang.Override
            public int getMatchTypeValue() {
                return matchType_;
            }
            /**
             * <code>.MatchType match_type = 6;</code>
             *
             * @param value The enum numeric value on the wire for matchType to set.
             * @return This builder for chaining.
             */
            public Builder setMatchTypeValue(int value) {

                matchType_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>.MatchType match_type = 6;</code>
             *
             * @return The matchType.
             */
            @java.lang.Override
            public emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType getMatchType() {
                @SuppressWarnings("deprecation")
                emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType result =
                        emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.valueOf(matchType_);
                return result == null
                        ? emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType.UNRECOGNIZED
                        : result;
            }
            /**
             * <code>.MatchType match_type = 6;</code>
             *
             * @param value The matchType to set.
             * @return This builder for chaining.
             */
            public Builder setMatchType(emu.grasscutter.net.proto.MatchTypeOuterClass.MatchType value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                matchType_ = value.getNumber();
                onChanged();
                return this;
            }
            /**
             * <code>.MatchType match_type = 6;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearMatchType() {

                matchType_ = 0;
                onChanged();
                return this;
            }

            private boolean isAgreed_;
            /**
             * <code>bool is_agreed = 11;</code>
             *
             * @return The isAgreed.
             */
            @java.lang.Override
            public boolean getIsAgreed() {
                return isAgreed_;
            }
            /**
             * <code>bool is_agreed = 11;</code>
             *
             * @param value The isAgreed to set.
             * @return This builder for chaining.
             */
            public Builder setIsAgreed(boolean value) {

                isAgreed_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool is_agreed = 11;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearIsAgreed() {

                isAgreed_ = false;
                onChanged();
                return this;
            }

            private int retcode_;
            /**
             * <code>int32 retcode = 9;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 9;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
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

            // @@protoc_insertion_point(builder_scope:PlayerConfirmMatchRsp)
        }

        // @@protoc_insertion_point(class_scope:PlayerConfirmMatchRsp)
        private static final emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass
                        .PlayerConfirmMatchRsp
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE =
                    new emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp();
        }

        public static emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<PlayerConfirmMatchRsp> PARSER =
                new com.google.protobuf.AbstractParser<PlayerConfirmMatchRsp>() {
                    @java.lang.Override
                    public PlayerConfirmMatchRsp parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new PlayerConfirmMatchRsp(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<PlayerConfirmMatchRsp> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<PlayerConfirmMatchRsp> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.PlayerConfirmMatchRspOuterClass.PlayerConfirmMatchRsp
                getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_PlayerConfirmMatchRsp_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_PlayerConfirmMatchRsp_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\033PlayerConfirmMatchRsp.proto\032\017MatchType"
                    + ".proto\"m\n\025PlayerConfirmMatchRsp\022\020\n\010match"
                    + "_id\030\001 \001(\r\022\036\n\nmatch_type\030\006 \001(\0162\n.MatchTyp"
                    + "e\022\021\n\tis_agreed\030\013 \001(\010\022\017\n\007retcode\030\t \001(\005B\033\n"
                    + "\031emu.grasscutter.net.protob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                            emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor(),
                        });
        internal_static_PlayerConfirmMatchRsp_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_PlayerConfirmMatchRsp_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_PlayerConfirmMatchRsp_descriptor,
                        new java.lang.String[] {
                            "MatchId", "MatchType", "IsAgreed", "Retcode",
                        });
        emu.grasscutter.net.proto.MatchTypeOuterClass.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}