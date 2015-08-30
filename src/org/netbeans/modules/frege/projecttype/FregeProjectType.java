/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.projecttype;

import java.io.IOException;
import org.netbeans.api.project.Project;
import org.netbeans.spi.project.ProjectFactory;
import org.netbeans.spi.project.ProjectState;
import org.openide.filesystems.FileObject;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author rhegde
 */
@ServiceProvider(service = ProjectFactory.class)
public class FregeProjectType implements ProjectFactory {
    public static final String PROJECT_DIR = "src/main/frege";
    @Override
    public boolean isProject(FileObject projectDirectory) {
        return projectDirectory.getFileObject(PROJECT_DIR) != null;
    }
    @Override
    public Project loadProject(FileObject dir, ProjectState state) throws IOException {
        return isProject(dir) ? new FregeProject(dir) : null;
    }
    @Override
    public void saveProject(final Project project) throws IOException, ClassCastException {
    }
}
