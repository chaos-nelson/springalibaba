package com.itmuch.usercenter.domain.dto.messaging;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @author JourWon
 * @date Created on 2021/8/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserAddBonusMsgDTO {

    /**
     * 为谁加积分
     */
    private Integer userId;

    /**
     * 加多少积分
     */
    private Integer bonus;
}
