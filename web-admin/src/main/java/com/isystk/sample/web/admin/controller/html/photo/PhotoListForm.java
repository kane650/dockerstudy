package com.isystk.sample.web.admin.controller.html.photo;

import com.isystk.sample.common.dto.Pageable;
import com.isystk.sample.web.base.controller.html.BaseSearchForm;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PhotoListForm extends BaseSearchForm implements Pageable {

  private static final long serialVersionUID = 7593564324192730932L;

  String name;

}
