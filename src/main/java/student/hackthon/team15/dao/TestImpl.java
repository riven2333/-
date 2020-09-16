package student.hackthon.team15.dao;

import oracle.jrockit.jfr.openmbean.ProducerDescriptorType;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;



import org.slf4j.Logger;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.productPerson;

import java.util.List;


@Service
public class TestImpl implements Test{
    private static final Logger logger = LoggerFactory.getLogger(TestImpl.class);
    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public productPerson getBookById(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        return mongoTemplate.findOne(query, productPerson.class);
    }

    @Override
    public void findAll(productPerson productPerson) {
        mongoTemplate.insert(productPerson,"person");
    }

    @Override
    public void dele(String id){
        Query query = new Query(Criteria.where("_id").is(id));
        mongoTemplate.remove(query,"person");
    }

}
