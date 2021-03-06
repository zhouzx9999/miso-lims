package uk.ac.bbsrc.tgac.miso.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import uk.ac.bbsrc.tgac.miso.core.data.impl.view.PoolableElementView;
import uk.ac.bbsrc.tgac.miso.core.service.PoolableElementViewService;
import uk.ac.bbsrc.tgac.miso.core.util.PaginationFilter;
import uk.ac.bbsrc.tgac.miso.persistence.PoolableElementViewDao;

@Service
@Transactional(rollbackFor = Exception.class)
public class DefaultPoolableElementViewService implements PoolableElementViewService {

  @Autowired
  private PoolableElementViewDao poolableElementViewDao;

  public void setPoolableElementViewDao(PoolableElementViewDao dao) {
    this.poolableElementViewDao = dao;
  }

  @Override
  public PoolableElementView get(Long aliquotId) throws IOException {
    return poolableElementViewDao.get(aliquotId);
  }

  @Override
  public PoolableElementView getByBarcode(String barcode) throws IOException {
    return poolableElementViewDao.getByBarcode(barcode);
  }

  @Override
  public PoolableElementView getByPreMigrationId(Long preMigrationId) throws IOException {
    return poolableElementViewDao.getByPreMigrationId(preMigrationId);
  }

  @Override
  public long count(Consumer<String> errorHandler, PaginationFilter... filter) throws IOException {
    return poolableElementViewDao.count(errorHandler, filter);
  }

  @Override
  public List<PoolableElementView> list(Consumer<String> errorHandler, int offset, int limit, boolean sortDir, String sortCol,
      PaginationFilter... filter)
      throws IOException {
    return poolableElementViewDao.list(errorHandler, offset, limit, sortDir, sortCol, filter);
  }

  @Override
  public List<PoolableElementView> list(List<Long> aliquotIds) throws IOException {
    return poolableElementViewDao.list(aliquotIds);
  }

}
