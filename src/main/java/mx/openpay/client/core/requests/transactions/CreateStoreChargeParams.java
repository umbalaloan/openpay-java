/*
 * Copyright 2014 Opencard Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mx.openpay.client.core.requests.transactions;

import java.math.BigDecimal;

import mx.openpay.client.core.requests.RequestBuilder;
import mx.openpay.client.enums.ChargeMethods;

/**
 * @author Luis Delucio
 */
public class CreateStoreChargeParams extends RequestBuilder {

    /**
	 *
	 */
    public CreateStoreChargeParams() {
        this.with("method", ChargeMethods.STORE.name().toLowerCase());
    }

    /**
     * The amount to charge the customer. Required. The customer should pay this exact amount.
     */
    public CreateStoreChargeParams amount(final BigDecimal amount) {
        return this.with("amount", amount);
    }

    /**
     * A description for the charge. Optional.
     */
    public CreateStoreChargeParams description(final String description) {
        return this.with("description", description);
    }

    /**
     * A custom unique ID to identify the charge. Optional.
     */
    public CreateStoreChargeParams orderId(final String orderId) {
        return this.with("order_id", orderId);
    }

}