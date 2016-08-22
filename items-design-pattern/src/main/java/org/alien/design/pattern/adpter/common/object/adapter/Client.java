package org.alien.design.pattern.adpter.common.object.adapter;

import org.alien.design.pattern.adpter.common.object.adapter.adaptee.AdapteeA;
import org.alien.design.pattern.adpter.common.object.adapter.adaptee.AdapteeB;
import org.alien.design.pattern.adpter.common.object.adapter.adapter.Adapter;
import org.alien.design.pattern.adpter.common.object.adapter.target.Target;
import org.alien.design.pattern.adpter.common.object.adapter.target.TargetImpl;

/**
 * Description :
 *
 * @author : oscar
 * @version :1.0, 2016/8/22
 */
public class Client {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        target.requestA();
        target.requestB();

        Target adapter = new Adapter(new AdapteeA(), new AdapteeB());
        adapter.requestA();
        adapter.requestB();
    }
}
