package icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Regular.SiMove: ImageVector
    get() {
        if (_SiMove != null) {
            return _SiMove!!
        }
        _SiMove = ImageVector.Builder(
            name = "Regular.SiMove",
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
                moveToRelative(19f, 15f)
                lineToRelative(3f, -3f)
                moveToRelative(0f, 0f)
                lineToRelative(-3f, -3f)
                moveToRelative(3f, 3f)
                horizontalLineTo(2f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, 3f)
                moveToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
                moveToRelative(10f, -4f)
                lineToRelative(-3f, -3f)
                moveToRelative(0f, 0f)
                lineTo(9f, 5f)
                moveToRelative(3f, -3f)
                verticalLineToRelative(20f)
                moveToRelative(0f, 0f)
                lineToRelative(3f, -3f)
                moveToRelative(-3f, 3f)
                lineToRelative(-3f, -3f)
            }
        }.build()

        return _SiMove!!
    }

@Suppress("ObjectPropertyName")
private var _SiMove: ImageVector? = null
