/**
 * @license
 * Copyright 2019 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */

 import {LitElement, html, css} from 'lit';
import {customElement, property} from 'lit/decorators.js';


/**
 * Global View
 *
 */
@customElement('qk-global-view')
export class QkGlobalView extends LitElement {

  override render() {
    return html`
      Global View
    `;
  }


}


//https://lit.dev/docs/components/defining/
//Providing good TypeScript typings
declare global {
  interface HTMLElementTagNameMap {
    'qk-global-view': QkGlobalView;
  }
}
