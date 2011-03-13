/*
 * Copyright 2010 The Fornax Project Team, including the original
 * author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.fornax.cartridges.sculptor.framework.event;

class EventListener {
    final String topic;
    final EventSubscriber subscriber;

    EventListener(String topic, EventSubscriber subscriber) {
        this.topic = topic;
        this.subscriber = subscriber;
    }

    boolean isInterestedIn(String topic) {
        return this.topic.equals(topic);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + topic.hashCode();
        result = prime * result + subscriber.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventListener other = (EventListener) obj;

        return topic.equals(other.topic) && subscriber.equals(other.subscriber);
    }

}