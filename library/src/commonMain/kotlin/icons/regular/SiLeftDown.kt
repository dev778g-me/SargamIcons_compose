package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiLeftDown: ImageVector
    get() {
        if (_SiLeftDown != null) {
            return _SiLeftDown!!
        }
        _SiLeftDown = ImageVector.Builder(
            name = "Regular.SiLeftDown",
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
                moveTo(9f, 19f)
                verticalLineTo(9.4f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.4f, 5f)
                horizontalLineTo(19f)
                moveTo(9f, 19f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _SiLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _SiLeftDown: ImageVector? = null
