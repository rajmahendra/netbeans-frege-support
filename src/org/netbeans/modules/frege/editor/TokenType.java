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

    NEWLINE(1, ""),
    CONSTRUCTOR_ID(2, ""),
    VARIABLE_ID(3, ""),
    LETTER(4, ""),
    INTEGER(5, ""),
    HEXADECIMAL(6, ""),
    OCTAL(7, ""), 
    DECIMAL(8, ""), 
    DIGIT(9, ""), 
    HEXIT(10, ""), 
    OCTIT(11, ""), 
    LEFT_CURLY(12, "{"), 
    RIGHT_CURLY(13, "}"),
    SEMICOLON(14, ";"), 
    LEFT_PAREN(15, "("), 
    RIGHT_PAREN(16, ")"), 
    LEFT_BRACKET(17, "["), 
    RIGHT_BRACKET(18, "]"),
    COMMA(19, ","), 
    INFIX_QUOTE(20, "`"), 
    VARSYM(21, ""), 
    CONSYM(22, ""), 
    LOWER_CASE(23, ""), 
    UPPER_CASE(24, ""),
    SYMBOL(25, ""), 
    UNANTICIPATED_SYMBOL(26, ""),
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
    WHERE(51, "where"),
    CONTEXT_ARROW(52, "=>"),
    EQUALS(53, "="),
    ALT(54, "|"),
    OFTYPE(55, "::"),
    WS(56, " "),
    COMMENT(57, ""),
    LINE_COMMENT(58, ""),
    BLOCK_COMMENT(59, ""),
    ERR_CHAR(60, "");

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
