/**
 * @license
 * Copyright 2019 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */

 import {LitElement, html, css} from 'lit';
import {customElement, property} from 'lit/decorators.js';

import './qk-graphql-selector';
import './qk-global-view';

/**
 * Main Area
 *
 */
@customElement('qk-main-area')
export class QkMainArea extends LitElement {

  override render() {
    return html`
      <qk-graphql-selector></qk-graphql-selector>
      <qk-global-view></qk-global-view>
    `;
  }


}


//https://lit.dev/docs/components/defining/
//Providing good TypeScript typings
declare global {
  interface HTMLElementTagNameMap {
    'qk-main-area': QkMainArea;
  }
}
