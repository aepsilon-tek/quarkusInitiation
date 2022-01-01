/**
 * @license
 * Copyright 2019 Google LLC
 * SPDX-License-Identifier: BSD-3-Clause
 */

 import {LitElement, html, css} from 'lit';
import {customElement, property} from 'lit/decorators.js';

import './main.css'

/**
 * An example element.
 *
 * @fires count-changed - Indicates when the count changes
 * @slot - This element has a slot
 * @csspart button - The button
 */
@customElement('qk-graphql-selector')
export class QkGraphqlSelector extends LitElement {

  /**
   * The name to say "Hello" to.
   */
  @property()
  name = 'World';

  /**
   * The number of times the button has been clicked.
   */
  @property({type: Number})
  count = 0;

  override render() {
    return html`
    YOP
      <div class="grid grid-cols-2 gap-3">
        <div class="shadow-sm bg-white rounded-lg">
          shadow-sm
      </div>
      <div class="shadow bg-white rounded-lg">
        shadow
      </div>
      </div>
    `;
  }

  /**
   * Formats a greeting
   * @param name The name to say "Hello" to
   */
  sayHello(name: string): string {
    return `Hello, ${name}`;
  }
}


//https://lit.dev/docs/components/defining/
//Providing good TypeScript typings
declare global {
  interface HTMLElementTagNameMap {
    'qk-graphql-selector': QkGraphqlSelector;
  }
}
