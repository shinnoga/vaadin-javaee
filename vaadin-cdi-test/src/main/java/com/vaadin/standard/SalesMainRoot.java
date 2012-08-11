package com.vaadin.standard;

import com.vaadin.cdi.annotation.DeployableVaadinRoot;
import com.vaadin.terminal.WrappedRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.Root;

@DeployableVaadinRoot(mapping = "sales")
public class SalesMainRoot extends Root {

	@Override
	protected void init(WrappedRequest request) {
		addComponent(new Label("Sales main"));

	}

}
