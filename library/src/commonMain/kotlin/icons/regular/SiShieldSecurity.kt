package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiShieldSecurity: ImageVector
    get() {
        if (_SiShieldSecurity != null) {
            return _SiShieldSecurity!!
        }
        _SiShieldSecurity = ImageVector.Builder(
            name = "Regular.SiShieldSecurity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 11f)
                horizontalLineToRelative(16f)
                moveToRelative(-8f, 10f)
                verticalLineTo(2f)
                moveToRelative(-8f, 9.252f)
                curveToRelative(0f, 7.687f, 6.918f, 10.387f, 7.887f, 10.728f)
                quadToRelative(0.113f, 0.04f, 0.226f, 0f)
                curveTo(13.084f, 21.65f, 20f, 19.018f, 20f, 11.253f)
                verticalLineTo(4.304f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.303f, -0.389f)
                lineToRelative(-7.6f, -1.903f)
                arcToRelative(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.194f, 0f)
                lineToRelative(-7.6f, 1.903f)
                arcTo(0.4f, 0.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4.304f)
                close()
            }
        }.build()

        return _SiShieldSecurity!!
    }

@Suppress("ObjectPropertyName")
private var _SiShieldSecurity: ImageVector? = null
