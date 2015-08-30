/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.modules.frege.projecttype;

import java.beans.PropertyChangeListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.netbeans.api.annotations.common.StaticResource;
import org.netbeans.api.project.Project;
import org.netbeans.api.project.ProjectInformation;
import org.openide.filesystems.FileObject;
import org.openide.util.ImageUtilities;
import org.openide.util.Lookup;
import org.openide.util.lookup.Lookups;

/**
 *
 * @author rhegde
 */
public class FregeProject implements Project {
    private final FileObject dir;
    public FregeProject(FileObject dir) {
        this.dir = dir;
    }
    @Override
    public FileObject getProjectDirectory() {
        return dir;
    }
    private Lookup lkp;
    @Override
    public Lookup getLookup() {
        if (lkp == null) {
            lkp = Lookups.fixed(new Object[]{
                new FregeProjectInformation(),
                new FregeProjectLogicalView(this),
                new FregeActionProvider(),
            });
        }
        return lkp;
    }
    class FregeProjectInformation implements ProjectInformation {
        @StaticResource()
        public static final String CUSTOMER_ICON = "org/netbeans/modules/frege/project/gradle/Frege.png";
        @Override
        public Icon getIcon() {
            return new ImageIcon(ImageUtilities.loadImage(CUSTOMER_ICON));
        }
        @Override
        public String getName() {
            return getProjectDirectory().getName();
        }
        @Override
        public String getDisplayName() {
            return getName();
        }
        @Override
        public void addPropertyChangeListener(PropertyChangeListener pcl) {
        }
        @Override
        public void removePropertyChangeListener(PropertyChangeListener pcl) {
        }
        @Override
        public Project getProject() {
            return FregeProject.this;
        }
    }
}
