package project.z_v.manager.service;

import java.util.List;

public interface InformationService {
    List<managerService> getFileBoardList();
    managerService fileBoardDetail (Long b_no);
}
