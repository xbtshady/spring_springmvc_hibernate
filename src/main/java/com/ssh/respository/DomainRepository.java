package com.ssh.respository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/3/21.
 */
public interface DomainRepository<T,PK extends Serializable> {
    T load(PK id);

    T get(PK id);

}
