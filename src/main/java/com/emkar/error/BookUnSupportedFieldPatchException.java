package com.emkar.error;

import java.util.Set;

public class BookUnSupportedFieldPatchException extends RuntimeException {
    public BookUnSupportedFieldPatchException(Set<String> strings) {
        super("Field " + strings.toString() + " update is not allow.");
    }
}
