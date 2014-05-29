package com.captainbern.minecraft.reflection.providers.remapper;

public class RemapperException extends RuntimeException {

    private final Reason reason;

    public RemapperException(final Reason reason) {
        this.reason = reason;
    }

    public Reason getReason() {
        return this.reason;
    }

    public static enum Reason {
        REMAPPER_NOT_FOUND("Remapper not found!"),
        REMAPPER_DISABLED("Remapper was found but is not enabled!");

        private final String additionalInfo;

        private Reason(final String additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public String getAdditionalInfo() {
            return this.additionalInfo;
        }
    }
}
