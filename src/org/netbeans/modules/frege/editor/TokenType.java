/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.editor;

/**
 *
 * @author rhegde
 */
public enum TokenType {

    
    AS(27, "as"),
    CASE(28, "case"),
    CLASS(29, "class"),
    DATA(30, "data"),
    DEFAULT(31, "default"),
    DERIVING(32, "deriving"),
    DO(33, "do"),
    ELSE(34, "else"),
    HIDING(35, "hiding"),
    FOREIGN(36, "foreign"),
    IF(37, "if"),
    IMPORT(38, "import"),
    IN(39, "in"),
    INFIX(40, "infix"),
    INFIXL(41, "infixl"),
    INFIXR(42, "infixr"),
    INSTANCE(43, "instance"),
    LET(44, "let"),
    MODULE(45, "module"),
    NEWTYPE(46, "newtype"),
    OF(47, "of"),
    QUALIFIED(48, "qualified"),
    THEN(49, "then"),
    TYPE(50, "type"),
    WHERE(51, "where");

    public int id;
    public String category;
    public String text;

    private TokenType(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public static TokenType valueOf(int id) {
        TokenType[] values = values();
        for (TokenType value : values) {
            if (value.id == id) {
                return value;
            }
        }
        throw new IllegalArgumentException("The id " + id + " is not recognized");
    }
}
