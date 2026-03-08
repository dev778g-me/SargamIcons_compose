package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiDownRight: ImageVector
    get() {
        if (_SiDownRight != null) {
            return _SiDownRight!!
        }
        _SiDownRight = ImageVector.Builder(
            name = "Duotone.SiDownRight",
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
                moveTo(19f, 15f)
                horizontalLineTo(9.4f)
                arcTo(4.4f, 4.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 10.6f)
                verticalLineTo(5f)
                moveToRelative(14f, 10f)
                lineToRelative(-4f, 4f)
                moveToRelative(4f, -4f)
                lineToRelative(-4f, -4f)
            }
        }.build()

        return _SiDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _SiDownRight: ImageVector? = null
