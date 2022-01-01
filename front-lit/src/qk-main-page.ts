/**
 * @license
 * Copyright 2019 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */
 import {LitElement, html, css} from 'lit';
import {customElement, property} from 'lit/decorators.js';

import './main.css'
import './qk-header';
import './qk-main-area';
import './qk-footer';

/**
 * Main Page
 *
 */
@customElement('qk-main-page')
export class QkMainPage extends LitElement {

  override render() {
    return html`
    <h1 class="mx-auto my-4 py-4 text-center shadow-lg text-xl w-1/2">Hello, World!</h1>
      <qk-header></qk-header>
      <qk-main-area></qk-main-area>
      <qk-footer></qk-footer>
    `;
  }


}


//https://lit.dev/docs/components/defining/
//Providing good TypeScript typings
declare global {
  interface HTMLElementTagNameMap {
    'qk-main-page': QkMainPage;
  }
}
