package com.rest.api.endpoint;


import com.rest.api.request.GeneralRequest;
import com.rest.api.request.params.CreateAccountParams;
import com.rest.api.response.GeneralResponse;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SwaggerDefinition(
 info = @Info(description = "Management Rest API", version = "1.0.0", title = "REST API"),
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        schemes = SwaggerDefinition.Scheme.HTTPS
)

@Api(tags = "Account Service")
@RequestMapping("/management/account")

public interface AccountEndpoint {

    @ApiOperation(value = "Create new account for client record")
    @ApiResponses(
            {@ApiResponse(code = 200, message = "OK - Account record created")}
    )
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    GeneralResponse<Long> createAccountRecord(GeneralRequest<CreateAccountParams> request);


}
