/*******************************************************************************
* Copyright (c) 2014 Cisco Systems
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* PDTool project commiters - initial release
*******************************************************************************/

package com.compositesw.services.system.admin.server;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.compositesw.services.system.util.common.BaseResponse;
import com.compositesw.services.system.util.common.MessageEntryList;


/**
 * <p>Java class for removeFromClusterResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="removeFromClusterResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.compositesw.com/services/system/util/common}baseResponse">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://www.compositesw.com/services/system/util/common}messageEntryList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "removeFromClusterResponse", propOrder = {
    "messages"
})
public class RemoveFromClusterResponse
    extends BaseResponse
{

    protected MessageEntryList messages;

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MessageEntryList }
     *     
     */
    public MessageEntryList getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageEntryList }
     *     
     */
    public void setMessages(MessageEntryList value) {
        this.messages = value;
    }

}
