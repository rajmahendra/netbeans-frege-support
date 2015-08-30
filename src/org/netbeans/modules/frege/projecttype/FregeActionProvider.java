/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.projecttype;

import org.netbeans.spi.project.ActionProvider;
import org.openide.util.Lookup;

/**
 *
 * @author rhegde
 */
public class FregeActionProvider implements ActionProvider {

    @Override
    public String[] getSupportedActions() {
        return new String[]{
            ActionProvider.COMMAND_RUN,
            ActionProvider.COMMAND_BUILD,
            ActionProvider.COMMAND_CLEAN,
            ActionProvider.COMMAND_COMPILE_SINGLE
        };
    }

    @Override
    public void invokeAction(String string, Lookup lookup) throws IllegalArgumentException {
    }

    @Override
    public boolean isActionEnabled(String string, Lookup lookup) throws IllegalArgumentException {
        return true;
    }

}