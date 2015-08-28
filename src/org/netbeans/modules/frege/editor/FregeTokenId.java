/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.editor;

import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.TokenId;

/**
 *
 * @author rhegde
 */
public class FregeTokenId implements TokenId {

    private static final Language<FregeTokenId> language = new FregeLanguageHierarchy().language();
    private final String name;
    private final String primaryCategory;
    private final int id;

    public FregeTokenId(String name, String primaryCategory, int id) {
        this.name = name;
        this.primaryCategory = primaryCategory;
        this.id = id;
    }

    public String primaryCategory() {
        return primaryCategory;
    }

    public int ordinal() {
        return id;
    }

    public String name() {
        return name;
    }

    public static final Language<FregeTokenId> getLanguage() {
        return language;
    }
}