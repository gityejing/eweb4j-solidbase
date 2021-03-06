package org.eweb4j.solidbase.resource.dao;

import java.util.Collection;

import org.eweb4j.solidbase.resource.model.Resource;
import org.eweb4j.solidbase.resource.model.ResourceException;

public interface ResourceDAO {

	Resource selectOneByUri(String uri) throws ResourceException;

	long insert(Resource resource) throws ResourceException;

	Collection<Resource> selectAll() throws ResourceException;

	void update(Resource resource) throws ResourceException;

	Resource selectOneByResId(long resId) throws ResourceException;

	void deleteByResId(long id) throws ResourceException;

	long countAll() throws ResourceException;

	Collection<Resource> divPage(int pageNum, int numPerPage) throws ResourceException;

	void batchDelete(Resource... resources) throws ResourceException;

}
