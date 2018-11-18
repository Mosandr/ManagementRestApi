package com.rest.api.endpoint;

import com.rest.api.dto.ClientDTO;
import com.rest.api.request.GeneralRequest;
import com.rest.api.request.params.CreateClientParams;
import com.rest.api.request.params.UpdateClientParams;
import com.rest.api.response.GeneralErrorResponse;
import com.rest.api.response.GeneralResponse;
import io.swagger.annotations.*;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SwaggerDefinition(
        info = @Info(description = "Management Rest API", version = "1.0.0", title = "REST API"),
        produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        schemes = SwaggerDefinition.Scheme.HTTPS
)

@Api(tags = "Client Service")
@RequestMapping("/management/client")

public interface ClientEndpoint {
    @ApiOperation(value = "Create new client record")
    @ApiResponses(
            {@ApiResponse(code = 200, message = "OK - Client record created")}
    )
    @RequestMapping( value = "/create", method = RequestMethod.POST)
    GeneralResponse<Long> createClientRecord(GeneralRequest<CreateClientParams> request);


    @ApiOperation(value = "Delete client record by ID")
    @ApiResponses(
            {@ApiResponse(code  = 200, message = "OK - Client record deleted"),
            @ApiResponse(code = 204, message = "NO Content"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 500, message = "Fail - Internal server error",
                    response = GeneralErrorResponse.class)}
        )
    @RequestMapping( value = "/delete", method = RequestMethod.DELETE)
    GeneralResponse<Void> deleteClient(Long clientId);

    @ApiOperation(value = "Read client record by client ID")
    @ApiResponses(
            {@ApiResponse(code = 200, message = "OK - client record returned"),
                    @ApiResponse(code = 401, message = "Unauthorized"),
                    @ApiResponse(code = 403, message = "Forbidden"),
                    @ApiResponse(code = 500, message = "Fail - Internal server error",
                            response = GeneralErrorResponse.class)}
    )
    @RequestMapping( value = "/get", method = RequestMethod.GET)
    GeneralResponse<ClientDTO> getClientById(Long id);

    @ApiOperation(value = "Read all clients records")
    @ApiResponses(
            {@ApiResponse(code = 200, message = "Ok"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not found")}
    )

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    GeneralResponse<List<ClientDTO>> getAllClient();

    @ApiOperation(value = "Update Client record")
    @ApiResponses(
            {@ApiResponse(code = 200, message = "Ok - client record updated"),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not found"),
            @ApiResponse(code = 500, message = "FAIL - internal server error")}
    )

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    GeneralResponse<Void> updateClient(GeneralRequest<UpdateClientParams> request);


}
