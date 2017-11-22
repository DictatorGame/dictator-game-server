/* Copyright 2017 dictator-game

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package dictator_game.web.api;

import java.util.concurrent.atomic.AtomicLong;

import dictator_game.model.Start;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Grzegorz Bylica grzegorz.bylica@gmail.com
 */
@RestController
@RequestMapping("/api")
public class StartController {


    @RequestMapping(value = "/start", method = RequestMethod.GET)
    public Start start() {
        return new Start(1L,"Start dictator-game");
    }
}
