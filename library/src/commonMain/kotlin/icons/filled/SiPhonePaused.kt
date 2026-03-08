package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Filled.SiPhonePaused: ImageVector
    get() {
        if (_SiPhonePaused != null) {
            return _SiPhonePaused!!
        }
        _SiPhonePaused = ImageVector.Builder(
            name = "Filled.SiPhonePaused",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.684f, 16.73f)
                lineTo(7.18f, 10.27f)
                reflectiveCurveTo(13.684f, 5.537f, 6.25f, 3f)
                curveTo(6.252f, 3f, 3f, 3.115f, 3f, 7.846f)
                curveToRelative(0f, 2.308f, 1.626f, 4.846f, 3.716f, 6.808f)
                curveToRelative(0.368f, 0.348f, 0.76f, 0.735f, 1.17f, 1.142f)
                curveToRelative(2.317f, 2.292f, 5.26f, 5.204f, 8.12f, 5.204f)
                curveTo(20.769f, 21f, 21f, 17.654f, 21f, 17.654f)
                curveToRelative(-2.206f, -6.462f, -6.62f, -1.73f, -7.316f, -0.923f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                moveTo(21f, 4f)
                verticalLineToRelative(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
            }
        }.build()

        return _SiPhonePaused!!
    }

@Suppress("ObjectPropertyName")
private var _SiPhonePaused: ImageVector? = null
