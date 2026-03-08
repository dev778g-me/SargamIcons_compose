package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiUserAlt2: ImageVector
    get() {
        if (_SiUserAlt2 != null) {
            return _SiUserAlt2!!
        }
        _SiUserAlt2 = ImageVector.Builder(
            name = "Regular.SiUserAlt2",
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
                moveTo(21f, 22f)
                curveToRelative(0f, -4.418f, -3.626f, -8f, -8.1f, -8f)
                horizontalLineToRelative(-1.8f)
                curveTo(6.626f, 14f, 3f, 17.582f, 3f, 22f)
                moveToRelative(9f, -11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, -4f)
                verticalLineTo(6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4f, 4f)
            }
        }.build()

        return _SiUserAlt2!!
    }

@Suppress("ObjectPropertyName")
private var _SiUserAlt2: ImageVector? = null
