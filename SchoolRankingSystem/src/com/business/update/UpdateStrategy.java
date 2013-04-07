package com.business.update;

import java.io.IOException;
import java.util.Iterator;

import com.bean.School;

public interface UpdateStrategy {
	Iterator<School> getData() throws IOException;
}
