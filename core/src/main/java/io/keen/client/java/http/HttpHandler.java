package io.keen.client.java.http;

import java.io.IOException;

/**
 * Interface which provides an abstraction around making HTTP requests.
 *
 * @author Kevin Litwack (kevin@kevinlitwack.com)
 * @since 2.0.0
 */
public interface HttpHandler {

    /**
     * Executes the given request and returns the received response.
     *
     * @param request
     * @throws java.io.IOException If there is an error executing the request or processing the
     * response.
     */
    Response execute(Request request) throws IOException;

}