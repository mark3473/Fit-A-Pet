package com.ssafy.fittapet.backend.domain.dto.guild;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter // Test용
public class GuildRequest {
    private String guildName;
    private Long guildPosition;
}
