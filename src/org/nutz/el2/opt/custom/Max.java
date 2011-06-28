package org.nutz.el2.opt.custom;

import java.util.List;

import org.nutz.el2.opt.RunMethod;

/**
 * 取大
 * @author juqkai(juqkai@gmail.com)
 *
 */
public class Max implements RunMethod{
	public Object run(List<Object> param) {
		if(param.size() == 1){
			return param.get(0);
		}
		if(param.size() >= 2){
			Number n1 = (Number) param.get(0);
			Number n2 = (Number) param.get(1);
			if(n1 == null){
				return n2;
			}
			if(n2 == null){
				return n1;
			}
			if(n1 instanceof Double || n2 instanceof Double){
				return Math.max(n1.doubleValue(), n2.doubleValue());
			}
			if(n1 instanceof Float || n2 instanceof Float){
				return Math.max(n1.floatValue(), n2.floatValue());
			}
			if(n1 instanceof Long || n2 instanceof Long){
				return Math.max(n1.longValue(), n2.longValue());
			}
			return Math.max(n1.intValue(), n2.intValue());
		}
		return null;
	}

}