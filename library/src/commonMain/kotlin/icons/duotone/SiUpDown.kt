package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.Sargam

val Sargam.Duotone.SiUpDown: ImageVector
    get() {
        if (_SiUpDown != null) {
            return _SiUpDown!!
        }
        _SiUpDown = ImageVector.Builder(
            name = "Duotone.SiUpDown",
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
                moveTo(12f, 3f)
                verticalLineToRelative(18f)
                moveToRelative(0f, -18f)
                lineTo(8f, 7f)
                moveToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                moveToRelative(-4f, 14f)
                lineToRelative(-4f, -4f)
                moveToRelative(4f, 4f)
                lineToRelative(4f, -4f)
            }
        }.build()

        return _SiUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _SiUpDown: ImageVector? = null
